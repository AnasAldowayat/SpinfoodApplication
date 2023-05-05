package main;

/**

 A class representing a group of participants.
 */
public class Group {
    private Pair pair1;
    private Pair pair2;
    private Pair pair3;

    /**

     Creates a new group with the specified pairs.
     @param pair1 The first pair in the group.
     @param pair2 The second pair in the group.
     @param pair3 The third pair in the group.
     */
    public Group(Pair pair1, Pair pair2, Pair pair3) {
        this.pair1 = pair1;
        this.pair2 = pair2;
        this.pair3 = pair3;
    }
    /**

     Gets the first pair in the group.
     @return The first pair in the group.
     */
    public Pair getPair1() {
        return pair1;
    }
    /**

     Sets the first pair in the group.
     @param pair1 The first pair in the group.
     */
    public void setPair1(Pair pair1) {
        this.pair1 = pair1;
    }
    /**

     Gets the second pair in the group.
     @return The second pair in the group.
     */
    public Pair getPair2() {
        return pair2;
    }
    /**

     Sets the second pair in the group.
     @param pair2 The second pair in the group.
     */
    public void setPair2(Pair pair2) {
        this.pair2 = pair2;
    }
    /**

     Gets the third pair in the group.
     @return The third pair in the group.
     */
    public Pair getPair3() {
        return pair3;
    }
    /**

     Sets the third pair in the group.
     @param pair3 The third pair in the group.
     */
    public void setPair3(Pair pair3) {
        this.pair3 = pair3;
    }
}