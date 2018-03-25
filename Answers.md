
1. `FixedArrayQueue` needs an explicit constructor since it is creating
an array. Since arrays are not adjustable like an `arrayList` we
have a constructor to set the size of the array. 

2. If you would offer an item to a full `FixedArrayQueue` depending 
on what you programmed it to do is whether it just won't accept it,
or will throw an exception, or send back a message. 

3. It will return a null value.

4. `Offer` is O(n) - because it has to find `rear` to place the object in that index.
   
   `Peek` and `Poll` are O(1) - since it only deals with the front.
   
   `Size` and `isEmpty` are also O(1) - since they deal with variable size
   and nothing else.
   
   `asList` is O(n) - as it has to go through the entire array
   to fill the list - as it has the added space of the list that is
   created and returned in the method.

