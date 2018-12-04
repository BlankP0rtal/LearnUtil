insert into customer(id,name,address,phone,email,points,discountperks,dueCount) values(Default,'Flex','23/4, A cross street,phanthom park,Ny-33',512896,'abc@xyz.com',0,0,0);
w
insert into product values(default,'varkie', 223,5,200,0,null,'2018-10-05','three months',FALSE);

(pid,name,code,price,availstock,tax,expirydate,dateofmanufature,validduration,"OfferAvail_Stat")

create table customer(
	id SERIAL PRIMARY KEY,
	name varchar(20),
	address varchar (128),
	phone BIGINT,
	email varchar(64);
	points Integer,
	discountperks decimal(6,3),
	dueCount Integer
)

create table bill (
bid SERIAL PRIMARY KEY,
cid Integer Reference customer(id) not null,
purchaseDate timestamp not null,
totalAmount decimal(9,3) not null,
totalDiscount decimal(6,3),
totalTax decimal(6,3),
amountPaid decimal(9,3) not null,
cancelProductCount  
);

create table billDetail (
bdid SERIAL PRIMARY	KEY,
bid Integer References bill(bid) not null,
pid Integer References produnct(pid) not null,
dcode varchar(32) not null,
purchaseDate timestamp not null,
unitPrice decimal(9,3) not null,
qty integer not null,
amountPaid decimal(9,3) not null,
amountPaidDate timestamp,
);

//Integer References produnct(pid) not null,

create table discount (
bdid SERIAL PRIMARY KEY,
pid Integer References produnct(pid) not null,
offcode varchar(32) not null,
discount decimal(6,3) ,
discount_amt(7,3),
note text
);



alter table bill_detail add constraint bill_detail_dcode_fkey FOREIGN KEY(dcode) References discount(offcode);


dues:{
	select customer.*,(dues.total - dues.amount_to_pay) as amountpaid from customer INNER JOIN bill onwhere totalamount > amountpaid group by cid) as dues ON dues.cid=id;

	--kill subquery
	select customer.*, sum(bill.totalamount - bill.amountpaid) as amountToPay,sum(bill.amountpaid) as paid, sum(bill.totalamount) as total from customer INNER JOIN bill on customer.id=bill.cid where bill.totalamount > bill.amountpaid group by customer.id;
}


top cust :{
	-- first try
	select * from (select cid,totalamount from bill where purchasedate between '2018-10-01' AND '2018-10-10' AND totalamount=amountpaid ORDER BY totalamount DESC)as topcust,customer where id = topcust.cid

	-- last try
	select * from customer INNER JOIN (select cid,sum(totalamount) as total from bill where purchasedate between '2018-10-01' AND '2018-12-10' AND totalamount = amountpaid Group by cid) as topcust ON id=topcust.cid
	order by topcust.total DESC;

	-- hit out subquery
	select customer.*,sum(bill.totalamount) as total,customer.id from customer INNER JOIN bill ON bill.cid = customer.id where bill.purchasedate between '2018-10-01' AND '2018-12-10' AND bill.totalamount = bill.amountpaid Group by customer.id order by total DESC;
}

unsoldprod:{
	select * from  product where pid NOT IN(select pid from bill_detail where purchasedate between '2018-10-01' AND '2018-12-01')

	select * from product where pid in(select pid from inventory where pid not in (Select pid from bill_detail where purchasedate between '2018-10-01' AND '2018-11-01') AND purchase_date between '2018-10-01' AND '2018-10-31');

	-- hit out subquery
	select product.* from product left join bill_detail on 
	product.pid = bill_detail.pid AND bill_detail.purchasedate between '2018-10-01' AND '2018-10-30'
	where product.availstock > 0 AND product.first_Date_of_purchase < '2018-10-30' AND bill_detail.pid IS NULL;
}

All_Bills:{
	select * from bill where purchasedate between '' AND '';
}

freq query:{
	update bill_detail set unitprice=(select price from product where pid=117) where pid=117 AND bid=83
	update bill set totalamount=(select sum(a.tot) from(select unitprice * qty as tot from bill_detail where bid=83) as a) where cid=1198;
	update bill set amountpaid=(select sum(a.tot) from(select amountpaid as tot from bill_detail where bid=87) as a) where bid=87;
}

