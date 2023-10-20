-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO author(id, firstName, lastName) VALUES (1, 'Isaac', 'Asimov');
INSERT INTO author(id, firstName, lastName) VALUES (2, 'Peter', 'Hamilton');
INSERT INTO author(id, firstName, lastName) VALUES (3, 'Alastair', 'Reynolds');

INSERT INTO book(id ,name, author_id) VALUES (4, 'Foundation', 1);
INSERT INTO book(id ,name, author_id) VALUES (5, 'Foundation and Empire', 1);
INSERT INTO book(id ,name, author_id) VALUES (6, 'Second Foundation', 1);

INSERT INTO book(id ,name, author_id) VALUES (7, 'The Dreaming Void', 2);
INSERT INTO book(id, name, author_id) VALUES (8, 'The Temporal Void', 2);
INSERT INTO book(id, name, author_id) VALUES (9, 'The Evolutionary Void', 2);

INSERT INTO book(id, name, author_id) VALUES (10, 'Revolution Space', 3);
INSERT INTO book(id, name, author_id) VALUES (11, 'Redemption Ark', 3);
INSERT INTO book(id, name, author_id) VALUES (12, 'Absolution Gap', 3);

INSERT INTO brewery(id, name, state) VALUES (13, 'The Alchemist', 'Vermont');
INSERT INTO brewery(id, name, state) VALUES (14, 'The Bruery', 'California');
INSERT INTO brewery(id, name, state) VALUES (15, 'Trillium Brewing Company', 'Massachusetts');

INSERT INTO beer(id, name, style, brewery_id) VALUES (16, 'Heady Topper', 'Imperial IPA', 13);
INSERT INTO beer(id, name, style, brewery_id) VALUES (17, 'Black Tuesday', 'American Imperial Stout', 14);
INSERT INTO beer(id, name, style, brewery_id) VALUES (18, 'Escape Plan', 'Fruited Kettle Sour', 15);

ALTER SEQUENCE hibernate_sequence RESTART WITH 19;