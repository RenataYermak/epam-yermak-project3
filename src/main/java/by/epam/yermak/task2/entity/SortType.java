package by.epam.yermak.task2.entity;

public enum SortType {
    ROW_SUM_ASCENDING ("Sorting in ascending  order of the sums of the elements of the rows of the matrix:"),
    ROW_SUM_DESCENDING ("Sorting in descending  order of the sums of the elements of the rows of the matrix:"),
    MAX_ELEMENT_ASCENDING ("Sorting in ascending  order of the maximum of the elements of the rows of the matrix:"),
    MAX_ELEMENT_DESCENDING("Sorting in descending  order of the maximum of the elements of the rows of the matrix:"),
    MIX_ELEMENT_ASCENDING("Sorting in ascending  order of the minimum of the elements of the rows of the matrix:"),
    MIX_ELEMENT_DESCENDING("Sorting in descending  order of the minimum of the elements of the rows of the matrix:");

    public String type;

    SortType(String type) {
        this.type = type;
    }
}

