package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    if (size == capacity)
    {System.out.println("Queue is full");
      return false;}
    else
    {size = size+1;
      rear = (rear+1) % capacity;
      data[rear] = obj;

      return true;}
  }

  @Override
  public E peek() {
    if(isEmpty())
    {return null;}
    else
    {return data[front];}
  }

  @Override
  public E poll() {
    if(isEmpty())
    {return null;}
    else {
      E returning = data[front];
      front = (front+1)% capacity;
      size = size-1;
      return returning;
       }
  }

  @Override
  public boolean isEmpty() {
    if(size == 0)
    {return true;}
    else
    {return false;}
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    List<E>list = new ArrayList<>(capacity);
    if(isEmpty())
    {return list;}
    else
    {int start = front;
    do {
      list.add(data[front]);
      front  = (front+1)% capacity;
    }while(start !=front);

    return list;
  }
  }
}
