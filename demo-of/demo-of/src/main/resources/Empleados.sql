INSERT INTO empleados (id, Nombre, Apellido, AtraccionVinculada, AltaBaja, Turno, Sueldo, Ganancias) VALUES
(NEXTVAL('hibernate_sequence'), 'Pedro', 'López', 'Montaña Rusa X', 'Alta', 'Mañana', 1500, 50000),
(NEXTVAL('hibernate_sequence'), 'María', 'González', 'Torre de Caída', 'Baja', 'Tarde', 1400, 47000),
(NEXTVAL('hibernate_sequence'), 'Javier', 'Martínez', 'Carrusel Clásico', 'Alta', 'Noche', 1350, 40000),
(NEXTVAL('hibernate_sequence'), 'Lucía', 'Ramírez', 'Simulador Espacial', 'Alta', 'Mañana', 1600, 52000),
(NEXTVAL('hibernate_sequence'), 'Carlos', 'Fernández', 'Rápidos Acuáticos', 'Baja', 'Tarde', 1450, 45000);