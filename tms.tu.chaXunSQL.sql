-- 最近 1 日、7 日、30 日的接单总数
SELECT
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-16 00:00:00' THEN 1 ELSE 0 END) AS 最近1日接单数,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-22 00:00:00' THEN 1 ELSE 0 END) AS 最近7日接单数,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-02-23 00:00:00' THEN 1 ELSE 0 END) AS 最近30日接单数
FROM order_info;

-- 最近 1/7/30 日完成运输次数
SELECT
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-16 00:00:00' THEN 1 ELSE 0 END) AS 最近1日完成运输次数,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-22 00:00:00' THEN 1 ELSE 0 END) AS 最近7日完成运输次数,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-02-23 00:00:00' THEN 1 ELSE 0 END) AS 最近30日完成运输次数
FROM order_info;

-- 最近 1/7/30 日下单金额
SELECT
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-16 00:00:00' THEN collect_type ELSE 0 END) AS 最近1日下单金额,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-01-22 00:00:00' THEN collect_type ELSE 0 END) AS 最近7日下单金额,
  SUM(CASE WHEN create_time >= '2026-01-15 00:00:00'
            AND create_time <  '2026-02-23 00:00:00' THEN collect_type ELSE 0 END) AS 最近30日下单金额
FROM order_info;

-- 最近 1/7/30 日各类型货物下单金额所占比例
WITH amt AS (
    SELECT
        c.cargo_type,
        SUM(CASE WHEN i.create_time >= '2026-01-15' AND i.create_time < '2026-01-16' THEN i.collect_type ELSE 0 END) AS d1,
        SUM(CASE WHEN i.create_time >= '2026-01-15' AND i.create_time < '2026-01-22' THEN i.collect_type ELSE 0 END) AS d7,
        SUM(CASE WHEN i.create_time >= '2026-01-15' AND i.create_time < '2026-02-23' THEN i.collect_type ELSE 0 END) AS d30
    FROM order_info  AS i
    JOIN order_cargo AS c ON c.order_id = i.id
    WHERE i.create_time >= '2026-01-15'
    GROUP BY c.cargo_type
), total AS (
    SELECT
        SUM(d1) AS t1,
        SUM(d7) AS t7,
        SUM(d30) AS t30
    FROM amt
)
SELECT
    cargo_type                                       AS 货物类型,
    ROUND(d1 / NULLIF(t1,0) * 100, 2)                AS 最近1日占比,
    ROUND(d7 / NULLIF(t7,0) * 100, 2)                AS 最近7日占比,
    ROUND(d30 / NULLIF(t30,0) * 100, 2)              AS 最近30日占比
FROM amt, total
ORDER BY 货物类型;
