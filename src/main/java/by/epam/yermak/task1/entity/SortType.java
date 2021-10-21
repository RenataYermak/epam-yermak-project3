package by.epam.yermak.task1.entity;

public enum SortType {
    BUBBLE_SORT ("Bubble sort"),
    INSERTION_SORT ("Insertion sort"),
    SELECTION_SORT ("Selection sort");

    public String type;

    SortType(String type) {
        this.type=type;
    }
}
