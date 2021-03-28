package complete.newcode37;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 给出一组区间，请合并所有重叠的区间。
 请保证合并后的区间按区间起点升序排列。

 示例1
 输入
 [[10,30],[20,60],[80,100],[150,180]]
 返回值
 [[10,60],[80,100],[150,180]]
 * @author zhengyingshun
 * @date 2021/3/27 16:26
 */
public class NC37 {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return intervals;
        }

        // 首先根据start升序
        intervals.sort(Comparator.comparingInt(o -> o.start));

        ArrayList<Interval> result = new ArrayList<>();
        Interval currentVal = intervals.get(0);
        result.add(currentVal);

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start > currentVal.end) {
                currentVal = interval;
                result.add(interval);
            } else if (interval.end > currentVal.end) {
                currentVal.end = interval.end;
            }
        }

        return result;
    }


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public Interval createVal(int s, int e) {
        return new Interval(s, e);
    }

}
