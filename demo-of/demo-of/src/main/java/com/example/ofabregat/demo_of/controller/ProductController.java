@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ControladorGeneral {

    private final ProductoServicio productoServicio;
    private final AtraccionServicio atraccionServicio;
    private final CompraServicio compraServicio;
    private final EmpleadoServicio empleadoServicio;
    private final SocioServicio socioServicio;

    // ==================== PRODUCTOS ====================

    @GetMapping("/productos")
    public List<Producto> listarProductos() {
        return productoServicio.listarProductos();
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id) {
        return productoServicio.obtenerProductoPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/productos")
    public void nuevoProducto(@RequestBody Producto producto) {
        productoServicio.guardarProducto(producto);
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<Producto> editarProducto(@RequestBody Producto producto, @PathVariable Integer id) {
        return productoServicio.actualizarProducto(id, producto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/productos/{id}")
    public void borrarProducto(@PathVariable Integer id) {
        productoServicio.eliminarProducto(id);
    }

    // ==================== ATRACCIONES ====================

    @GetMapping("/atracciones")
    public List<Atraccion> listarAtracciones() {
        return atraccionServicio.listarAtracciones();
    }

    @GetMapping("/atracciones/{id}")
    public ResponseEntity<Atraccion> obtenerAtraccion(@PathVariable Integer id) {
        return atraccionServicio.obtenerAtraccionPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/atracciones")
    public void nuevaAtraccion(@RequestBody Atraccion atraccion) {
        atraccionServicio.guardarAtraccion(atraccion);
    }

    @PutMapping("/atracciones/{id}")
    public ResponseEntity<Atraccion> editarAtraccion(@RequestBody Atraccion atraccion, @PathVariable Integer id) {
        return atraccionServicio.actualizarAtraccion(id, atraccion)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/atracciones/{id}")
    public void borrarAtraccion(@PathVariable Integer id) {
        atraccionServicio.eliminarAtraccion(id);
    }

    // ==================== COMPRAS ====================

    @GetMapping("/compras")
    public List<Compra> listarCompras() {
        return compraServicio.listarCompras();
    }

    @GetMapping("/compras/{id}")
    public ResponseEntity<Compra> obtenerCompra(@PathVariable Integer id) {
        return compraServicio.obtenerCompraPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/compras")
    public void nuevaCompra(@RequestBody Compra compra) {
        compraServicio.guardarCompra(compra);
    }

    @PutMapping("/compras/{id}")
    public ResponseEntity<Compra> editarCompra(@RequestBody Compra compra, @PathVariable Integer id) {
        return compraServicio.actualizarCompra(id, compra)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/compras/{id}")
    public void borrarCompra(@PathVariable Integer id) {
        compraServicio.eliminarCompra(id);
    }

    // ==================== EMPLEADOS ====================

    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados() {
        return empleadoServicio.listarEmpleados();
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable Integer id) {
        return empleadoServicio.obtenerEmpleadoPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/empleados")
    public void nuevoEmpleado(@RequestBody Empleado empleado) {
        empleadoServicio.guardarEmpleado(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> editarEmpleado(@RequestBody Empleado empleado, @PathVariable Integer id) {
        return empleadoServicio.actualizarEmpleado(id, empleado)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/empleados/{id}")
    public void borrarEmpleado(@PathVariable Integer id) {
        empleadoServicio.eliminarEmpleado(id);
    }

    // ==================== SOCIOS ====================

    @GetMapping("/socios")
    public List<Socio> listarSocios() {
        return socioServicio.listarSocios();
    }

    @GetMapping("/socios/{id}")
    public ResponseEntity<Socio> obtenerSocio(@PathVariable Integer id) {
        return socioServicio.obtenerSocioPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/socios")
    public void nuevoSocio(@RequestBody Socio socio) {
        socioServicio.guardarSocio(socio);
    }

    @PutMapping("/socios/{id}")
    public ResponseEntity<Socio> editarSocio(@RequestBody Socio socio, @PathVariable Integer id) {
        return socioServicio.actualizarSocio(id, socio)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/socios/{id}")
    public void borrarSocio(@PathVariable Integer id) {
        socioServicio.eliminarSocio(id);
    }
}
