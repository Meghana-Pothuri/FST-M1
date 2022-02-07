REM   Script: Activity7
REM   Activity7

select SUM(purchase_amount) AS "TotalSum" from orders;

select AVG(purchase_amount) AS "AveragePurhaseAmount" from orders;

select MAX(purchase_amount) AS "MaxPurchaseAmount" from orders;

select MIN(purchase_amount) AS "MinPurchaseAmount" from orders;

select COUNT(distinct salesman_id) AS "SalesmanCount" from orders;

