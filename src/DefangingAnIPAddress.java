/*
LINK: https://leetcode.com/problems/defanging-an-ip-address/
THEORY:
    1. Initialise a StringBuilder variable
    2. Go through a for loop for every char in the address string
    3. Append the char if it is not a dot else append [.] instead of .
 */


public class DefangingAnIPAddress {
    public String StringBuilderSolution(String address) {
        StringBuilder str = new StringBuilder();
        for (char c : address.toCharArray()){
            str.append((c == '.')? "[.]" : c );
        }
        return str.toString();
    }

    // Simply use a replace function
    public String replaceFunction(String address) {
        return address.replace("." , "[.]");
    }
}

/*
NEW SYNTAX LEARNT:
    1. StringBuilder: A class in java used to create mutable/ modifiable succession og characters. (Reference: https://www.simplilearn.com/tutorials/java-tutorial/stringbuilder-in-java#:~:text=StringBuilder%20in%20Java%20is%20a,an%20immutable%20succession%20of%20characters.)
    2. Use append() function to add char/string to the stringBuilder
    3.  Use str.toString() function to convert the StringBuilder to String.
 */