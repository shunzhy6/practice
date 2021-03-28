package complete.newcode37;

import org.junit.Test;

import java.util.ArrayList;

public class NC37Test {

    private NC37 nc37 = new NC37();

    @Test
    public void merge1() throws Exception {
        ArrayList<NC37.Interval> intervals = new ArrayList<>();
        intervals.add(nc37.createVal(10, 30));
        intervals.add(nc37.createVal(20, 60));
        intervals.add(nc37.createVal(80, 100));
        intervals.add(nc37.createVal(150, 180));

        ArrayList<NC37.Interval> result = nc37.merge(intervals);
        // [[10,60],[80,100],[150,180]]
        System.out.println(result.toString());
    }

    @Test
    public void merge2() throws Exception {
        ArrayList<NC37.Interval> intervals = new ArrayList<>();
        intervals.add(nc37.createVal(10, 30));
        intervals.add(nc37.createVal(30, 60));
        intervals.add(nc37.createVal(80, 100));
        intervals.add(nc37.createVal(150, 180));
        intervals.add(nc37.createVal(120, 200));

        ArrayList<NC37.Interval> result = nc37.merge(intervals);
        // [[10,60],[80,100],[120,200]]
        System.out.println(result.toString());
    }

}