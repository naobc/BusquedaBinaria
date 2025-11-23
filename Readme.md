Este código lee el archivo números.txt que contiene dos líneas,
línea uno = números ya ordenados
línea dos = número que se quiere buscar.
Busca en un arreglo ordenado marcando el incio y el fin (desde donde y hasta donde se buscara el digito solicitado).
int medio = (inicio + fin) / 2; divide el arreglo a la mitad para encontrar el valor medio,en caso de que el valor compara,
de no ser así busca depediendo de el número del medio,si es > busca a la izquierda y si es < busca a la derecha (va marcando el medio dentro de las busquedas)
se repite el proceso hsta encontrarlo,una vez encontrado
imprime resultado.txt con el índice de busqueda 
