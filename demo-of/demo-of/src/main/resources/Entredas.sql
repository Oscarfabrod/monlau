INSERT INTO compras (id, Comprada, Fecha, TipoEntrada, Precio, NombreComprador, Descuento) VALUES
(NEXTVAL('hibernate_sequence'), TRUE, '2024-03-15', 'VIP', 120.50, 'Carlos Gómez', 10),
(NEXTVAL('hibernate_sequence'), TRUE, '2024-03-16', 'General', 80.00, 'Laura Martínez', 5),
(NEXTVAL('hibernate_sequence'), FALSE, '2024-03-17', 'Infantil', 50.00, 'Andrés Pérez', 0),
(NEXTVAL('hibernate_sequence'), TRUE, '2024-03-18', 'Senior', 60.00, 'Sofía López', 15),
(NEXTVAL('hibernate_sequence'), TRUE, '2024-03-19', 'Estudiante', 70.00, 'Miguel Rodríguez', 20);