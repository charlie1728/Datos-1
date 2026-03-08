// -------------------------------------------------------------------- 
    //operar con bibliotecas 

    // public Map<Integer, Double> totalprestamos() throws IOException {
    //     cargarTodo();
    //     Map<Integer, Double> totalesPorLibro = new HashMap<>();

    //     // Un solo ciclo for recorre la lista de préstamos una única vez
    //     for (Prestamos p : data3) {
    //         double valorDelPrestamo = p.getCantidad();
    //         int idActual = p.getIdLibro();
            
    //         // Actualizamos el diccionario directamente con el ID del préstamo que estamos leyendo
    //         totalesPorLibro.put(idActual, totalesPorLibro.getOrDefault(idActual, 0.0) + valorDelPrestamo);
    //     }
    //     return totalesPorLibro; 
    // }


    // -------------------------------------------------------------------- 
    //recorrer una bibliotecas 
    // Map<Integer, Double> totalesPorLibro = gestor.totalprestamos();
    // for (Map.Entry<Integer, Double> entry : totalesPorLibro.entrySet()) {
    //     int idLibro = entry.getKey();
    //     double totalPrestamos = entry.getValue();
    //     System.out.println("ID del Libro: " + idLibro + " | Total de Préstamos: " + totalPrestamos);
    // }

   // --------------------------------------------------------------------  
    // este es el algoritmo de ordenamiento de menor a mayor 

    // public void listarLibrosOrdenadosPorAño() throws IOException {
    //     cargarTodo(); // Aseguramos tener la lista data2 actualizada
    //     int n = data2.size();
    //     boolean huboIntercambio;
        
    //     // Algoritmo de Burbuja (Bubble Sort) creado a mano
    //     for (int i = 0; i < n - 1; i++) {
    //         huboIntercambio = false;
            
    //         // Recorremos los libros comparando el actual (j) con el siguiente (j + 1)
    //         for (int j = 0; j < n - i - 1; j++) {
                
    //             // Si el año del libro actual es MAYOR que el año del siguiente...
    //             if (data2.get(j).getAño() > data2.get(j + 1).getAño()) {
                    
    //                 // ...los intercambiamos de posición usando una variable temporal
    //                 Libros temp = data2.get(j);
    //                 data2.set(j, data2.get(j + 1));
    //                 data2.set(j + 1, temp);
                    
    //                 huboIntercambio = true;
    //             }
    //         }
    //         // Si en esta pasada no intercambiamos nada, la lista ya está ordenada
    //         if (!huboIntercambio) {
    //             break;
    //         }
    //         guardarLibros();
    //     }
    
    // --------------------------------------------------------------------

    //         if (!ids.contains(u.getIdLibro())) {
    //     // para decir si no esta en la lista
    // }
