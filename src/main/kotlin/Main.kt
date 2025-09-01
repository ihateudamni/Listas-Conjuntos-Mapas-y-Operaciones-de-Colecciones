import model.Empleado

fun main() {
    val empleados = listOf(
        Empleado("Daniel", 21, 1.000000, "Publicidad"),
        Empleado("Ana", 34, 1.530000, "Publicidad"),
        Empleado("Laura", 27, 1.450000, "Publicidad"),
        Empleado("Valentina", 26, 1.600000, "Publicidad"),
        Empleado("Camila", 28, 1.700000, "Publicidad"),

        Empleado("Diego", 29, 1.800000, "Ventas"),
        Empleado("Sara", 25, 1.760000, "Ventas"),
        Empleado("Miguel", 32, 2.000000, "Ventas"),
        Empleado("Carlos", 30, 2.200000, "Ventas"),
        Empleado("Jorge", 35, 2.400000, "Ventas"),

        Empleado("Mariana", 31, 1.900000, "Contabilidad"),
        Empleado("Andrés", 40, 2.500000, "Contabilidad"),
        Empleado("Sofía", 29, 2.100000, "Contabilidad"),
        Empleado("Felipe", 33, 2.300000, "Contabilidad"),
        Empleado("Paula", 38, 2.700000, "Contabilidad")
    )

    val mayores30 = empleados.filter { it.edad > 30 }
    println("\n Empleados mayores de 30 años: ")
    mayores30.forEach { println("${it.nombre}-${it.edad}") }

    val agrupardepa = empleados.groupBy { it.departamentos }
    println("\n Agrupados por departamentos:")
    agrupardepa.forEach { (departamento, lista) ->
        println("$departamento: ${lista.map { it.nombre }}")
    }

    val salarioprome = empleados.groupBy { it.departamentos }
        .mapValues { (_, lista) -> lista.map { it.salario }.average() }
    println("\n Salario promedio por departamento:")
    salarioprome.forEach { (departamento, promedio) ->
        println("$departamento: $promedio")
    }

}



























