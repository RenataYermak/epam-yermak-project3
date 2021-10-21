package by.epam.yermak.task2.entity;

public enum SortType {
    ROW_SUM_ASCENDING,
    ROW_SUM_DESCENDING,
    MAX_ELEMENT_ASCENDING,
    MAX_ELEMENT_DESCENDING,
    MIX_ELEMENT_ASCENDING,
    MIX_ELEMENT_DESCENDING;

    public String type;


    SortType() {
    }

    SortType(String type) {
        this.type = type;
    }
}
