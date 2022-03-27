package lesson28.lesson1;

public abstract class Person {

  private Long id;

  public Person(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}