-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor (first_name, last_name)
values ('HAMPTON' , 'AVENUE');
insert into actor (first_name, last_name)
values ('LISA' , 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

insert into film (title, description , ç, language_id, length)
values('EUCLIDEAN PI' , 'The epic story of Euclid as a pizza delivery boy in ancient Greece' , 2008, 1 ,198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor(film_id , actor_id)
values (1001 , 201);

insert into film_actor(film_id , actor_id)
values (1001 , 202);

-- 4. Add Mathmagical to the category table.

insert into category (name)
values('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

-- Note: I have inserted the values first then noticed that these films already had been assigned to a category then I deleted the old values of the category within film_category.
insert into film_category (film_id , category_id)
values (1001, 17);

insert into film_category (film_id , category_id)
values (274, 17);

insert into film_category (film_id , category_id)
values (494, 17);

insert into film_category (film_id , category_id)
values (714, 17);

insert into film_category (film_id , category_id)
values (996, 17);

select * from film_category where film_id = 274

--start transaction 
--delete from film_category
--where film_id = 274 and category_id = 6
--rollback
--commit 


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

update film
set rating = 'G'
from film_category
where category_id = (select category_id from category where name ='Mathmagical') and film_category.film_id=film.film_id

-- 7. Add a copy of "Euclidean PI" to all the stores.
select * from film where title = 'EUCLIDEAN PI'
insert into inventory (film_id , store_id)
values(1001,1);


insert into inventory (film_id , store_id)
values(1001,2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
delete from film
where title = 'EUCLIDEAN PI';

-- it didn't succeed because of foreign key constraints where the film_actor,film_category & film_inventory tables will have orphen values 

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

delete from category
where name='Mathmagical';

-- it didn't succeed because of foreign key constraints where the film_category table will have orphen values 

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

delete from film_category
where category_id = (select category_id from category where category.name='Mathmagical');

-- yes, it succeeded because we are deleting the link between the tables.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

delete from category 
where name = 'Mathmagicle';
-- deleting the mathmagicle from category succeeded because this category id is no loneger related to the film table after deleting the link inside film_category table
delete from film
where title = 'EUCLIDEAN PI';
-- deleting the film 'EUCLIDEAN' wasn't succefful because of a forign key constraints where the film_actor & inventory tables will have an orphen values
 
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
-- we need to delete the film_id from film_actor table and we need to delet the film_id from the inventory table before deleting the film from film table
select* from film where title = 'EUCLIDEAN PI'

start transaction 
delete from film_actor
where film_id = 1001;

delete from inventory
where film_id=1001;

delete from film
where film_id=1001;
rollback
-- after runing the above steps accordingly, deleting the film from fill category will be succeeded.
--Note, I didn't commit the above steps 