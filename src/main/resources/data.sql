insert into SERVICE values(default,1000,'A haircut that always stays in trend. ' ||
 'This is done after analysis of four main factors: styling of the skull, natural' ||
  ' hair growth and growth, oval face and styling style. ',
    '6.jpg','3.jpg','7.jpg','103','Classical haircut');
insert into SERVICE values(default,800,'some description','child3.jpg','child1.jpg','child2.jpg','101','Child haircut');
insert into SERVICE values(default,700,'some description','1-2-1.jpg','1-2-2.jpg','1-2-3.jpg','105','Haircut 1-2 nozzles');
insert into SERVICE values(default,500,'some description','bm1.jpg','bm2.jpg','bm3.jpg','102','Black Mask');
insert into SERVICE values(default,500,'some description','hair-styling-1.jpg','hair-styling-2.jpg','hair-styling-3.jpg','100','Styling');
insert into SERVICE values(default,700,'Remove any stray hairs and tidy eyebrows for a natural look.' ||
 ' Please call in to check availability.','eyebrow-1.jpg','eyebrow.jpg','eyebrow-3.jpg','eyebrow','Eyebrow');
insert into SERVICE values(default,900,'Consultation followed by cleanse, colour and finish.','beard-color-1.jpg','beard-color-2.jpg','beard-color-3.jpg',
'beardcolor','Beard colour');
insert into SERVICE values(default,1000,'Grey coverage - Consultation followed by Cleanse, Colour and Finish.',
'hair-color-1.jpg','hair-color-2.jpg','hair-color-3.jpg','haircolor','Hair colour');
insert into SERVICE values(default,1000,'Pre cut consultation, finish and style.','student.jpg','student2.jpg','','nas','Nus student');
insert into SERVICE values(default,2000,'A hot towel application, lather and shave.','shave-1.jpg','shave-2.jpg','shave-3.jpg','headshave','Head shave');
insert into SERVICE values(default,900,'Consultation, defining beard lines with blade, ' ||
 'trimming and styling, plus advice on beard maintenance at home.','trim-1.jpeg','trim-2.jpeg','trim-3.jpeg','trim','Beard Trim');
insert into SERVICE values(default,800,' Pre shave consultation, hot and cold towels, with steam, cut throat razor shave, ' ||
 'head, shoulder and neck message, moisturising balm.','hot-1.jpg','hot-2.jpg','hot-3.jpg','shave','Hot Towel Shave');


insert into CLIENT values (default,'example@gmail.com','Max','','maxim12',	'123','89508762262','Rubanik','Alexeevich');
insert into CLIENT values (default,'admin@gmail.com','Snezha','admin.png','admin',	'admin','','Schenikova','Alexeevna');


insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',800,'2019-12-12','Hot Towel Shave','14:00-15:00','active');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',1000,'2019-12-12','Nus student','15:00-16:00','active');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',1000,'2019-12-12','Hair colour','15:00-16:00','active');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',1000,'2019-12-12','Hair colour','11:00-12:00','canceled');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',1000,'2019-12-12','Eyebrow','14:00-15:00','canceled');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',800,'2019-12-12','Hot Towel Shave','14:00-15:00','archived');
insert into RECORD values (default,1,'Max Alexeevich Rubanik','89508762262',700,'2019-12-12','Eyebrow','18:00-19:00','archived');

insert into information values (default,'We have a large number of customers due to low prices for our services','public.jpg');
insert into information values (default,'Want to make your hairstyle stunning? Go to our services','9.jpg');
insert into information values (default,'You can find some new promotions','promo.jpg');
insert into information values (default,'You can register and get history of your records','fire.jpg');
insert into information values (default,'We guarantee quality service in a short period of time.','2.jpg');
insert into information values (default,'You can choose convenient time of service','100.jpg');

insert into promotions values (default, 'Invite your friends and get 50% discount on all services','12.jpeg');
insert into promotions values (default, 'Only until 12.12 a discount on all services 30%','img1.jpg');
insert into promotions values (default, 'Sign up for 5 services in a row and get the sixth service for free','img2.jpg');
insert into promotions values (default, 'With online recording, prices are cheaper than live recording!','img3.jpg');
insert into promotions values (default, 'Only today a combination of the services Head shave, Beard Trim and Eyebrow for 1999','img4.jpg');
insert into promotions values (default, 'Tell 10 friends about our company and get a 50% discount on any service','img5.jpg');

