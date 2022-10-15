--Select
--ANSII

Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers; // Tablodaki isimleri yeniden adlandırdık.

SELECT * FROM Customers where City = 'Berlin';

--case insensitive
SELECT * FROM Products where categoryId=1 or CategoryId=3;
SELECT * FROM Products where categoryId=1 and price>=10;
SELECT * FROM Products order by ProductName

SELECT * FROM Products order by Price desc;   --ascending artan demek,descending azalan demek

SELECT * FROM Products where CategoryId=1 order by Price desc; -- id si 1 olan ürünlerin fiyatını yüksekten düşüğe sırala demek.

SELECT count(*) from Products; -- kaç satır var?

SELECT count(*) from Products where CategoryId=3; -- id si 3 olan kaç ürün var?

SELECT count(*) Adet from Products where CategoryId=3; -- Adet dediğimizde tablonun adını vermiş oluyoruz.

SELECT categoryId,count(*)from products group by CategoryId; -- group by her bir kategoriler için ayrı bir grup oluşturuyor. count her kategori için ayrı ayrı hesaplıyor.

SELECT categoryId,count(*)from products group by CategoryId having count(*)<10; --içerisinde 10 adetten az ürün çeşidi olan kategorileri ver.

SELECT categoryId,count(*)from products where Price>20 group by CategoryId having count(*)<10; --fiyatı 20 den fazla olan ürünleri kategori Id ye göre grupla onlardan da ürün çeşidi 10 dan az olanları ver demek.

SELECT*from Products inner join Categories on Products.CategoryId = Categories.CategoryId; --ürünle kategoriler birleşti.

SELECT Products.ProductId,Products.ProductName,Products.Price,Categories.CategoryName from Products inner join Categories on Products.CategoryId = Categories.CategoryId;
--DTO Data Transformation object --join ile ilgili

select*from Products p inner join OrderDetails od on p.ProductId = od.ProductId;

select*from Products p left join OrderDetails od on p.ProductId = od.ProductId; -- ürünler tablosunda olup satışı olmayanları yani solda olup sağda olmayanları getir.

select*from Customers c left join Orders o on c.CustomerId = o.CustomerId;

select*from Customers c left join Orders o on c.CustomerId = o.CustomerId where o.CustomerId is null; --null demek o data yok demek.

select*from Products p inner join OrderDetails od on p.ProductId = od.ProductId inner join Orders o on o.OrderId=od.OrderId; --iki tane sınıfı birleştirmek için.