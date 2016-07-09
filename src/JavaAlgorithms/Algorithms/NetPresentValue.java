package JavaAlgorithms.Algorithms;

import java.util.ArrayList;

/**
 * In finance, the net present value is an indicator of how profitable will be a project.
 *
 * Is calculated adding the flows of money each month divided by (1+r)^n,
 * where n is the number of the month and r is the rate of monthly discount, and subtracting the initial investment.
 *
 * For example, in a project in which the initial investment is $900, money flows for the first four months are
 * $550, $230 and $341 $190, and the monthly discount rate is 4%, the net present value is:
 *
 * NPV = −900+ (550/(1+0.04)^1) + (230(1+0.04)^2) + (341(1+0.04)^3) + (190(1+0.04)^4).
 *
 * If the NPV gives negative, then it is not suitable to begin the project.
 */

public class NetPresentValue {
    public NetPresentValue () {}

    private ArrayList<Integer> getNPV (ArrayList<Integer> data) {
        ArrayList<Integer> npvValues = new ArrayList<>();
        ArrayList<Integer> formattedData = new ArrayList<>();
        int sum = 0;

        if (data.get(0) > 0) {
            formattedData.add(data.get(0) * -1);
        }

        if (data.get(0) == 0) {
            npvValues.add(0);
            return npvValues;
        }

        formattedData.add(data.get(1) / 100);

        data.remove(0);
        data.remove(1);

        for (int i = 0; i < data.size(); i++) {
            if (sum == 0) {
                sum = formattedData.get(0) + (data.get(i) / (1 + formattedData.get(1)) ^ i + 1);
            } else {
                sum += data.get(i) / (1 + formattedData.get(1) ^ i + 1);
            }

            npvValues.add(sum);

            if (sum > 0) break;
        }

        return npvValues;
    }
}
