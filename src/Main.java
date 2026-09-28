/*
User stories:
(Number is priority)

- COMPLETE -
1. As a security officer, I want to be able to input the names of people who enter, so that we can have a record of who is in the
building at any given time.

- COMPLETE -
2. As a security officer, I want to be able to input the ID number of a person checking in, so that we can keep track of everyone in
the building with identical names

- COMPLETE -
3. As a security officer, I want to be able to input the access category someone entering the building, so that we know what areas
they can or can not access.

- COMPLETE -
4. As a security officer, I want to be able to specify who issued a badge, so that we can approximate what entrance and time a
person entered the building from.

- COMPLETE -
5. As a security officer, I want to be able to print all the badge information of someone in the building, so that we can
verify who they are if they enter a restricted area.
*/
void main(){
    Badge b=new Badge();
    b.getInformation();
    b.printBadge();
    
    // Tests
    b.setName(""); // Empty name
    b.setName("Barry");

    b.setAccessCategory(5); // Out of bounds category
    b.setAccessCategory(2);

    b.setIssuedBy(""); // Empty name
    b.setIssuedBy("Malo");

    b.setIdNumber(-10); // Negative id
    b.setIdNumber(1012);

    b.printBadge();
}