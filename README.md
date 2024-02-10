# OOPHW4
Есть вопрос по 4 семинару

private void addCapacity() {
        T[] array = (T[]) new Object[capacity * 2];
        System.arraycopy(arr, 0, array, 0, arr.length);
        arr = array;
    }

Значение capacity не меняется, остается таким же, как задано изначально. На семинаре это было 2. Первый раз мы увеличили вместимость до 4, но не присвоили это значение capacity. А значит, в следующий раз, когда надо будет увеличить вместимость, снова будет 2 * 2, вместимость не увеличится, возникнет ошибка

private void addCapacity() {
        capacity = capacity * 2;
        T[] array = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, array, 0, arr.length);
        arr = array;
    }



Реализовать свой LinkedList с методами вставки в начало, конец списка, получения размера списка и получения
элемента по индексу

Формат сдачи: ссылка на гит