package Modelagem;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sort {
    public void mergeSortByData(List<Dados1> lista) {
        mergeSort(lista, 0, lista.size() - 1);
    }

    private void mergeSort(List<Dados1> lista, int esq, int dir) {
        if (esq < dir) {
            int meio = esq + (dir - esq) / 2;

            mergeSort(lista, esq, meio);
            mergeSort(lista, meio + 1, dir);

            merge(lista, esq, meio, dir);
        }
    }

    private void merge(List<Dados1> lista, int esq, int meio, int dir) {
        List<Dados1> temp = new ArrayList<>();
        int i = esq, j = meio + 1;

        while (i <= meio && j <= dir) {
            LocalDate date1 = LocalDate.parse(lista.get(i).getDt_analise());
            LocalDate date2 = LocalDate.parse(lista.get(j).getDt_analise());

            if (date1.isAfter(date2)) {
                temp.add(lista.get(i));
                i++;
            } else {
                temp.add(lista.get(j));
                j++;
            }
        }

        while (i <= meio) {
            temp.add(lista.get(i));
            i++;
        }

        while (j <= dir) {
            temp.add(lista.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            lista.set(esq + k, temp.get(k));
        }
    }
}