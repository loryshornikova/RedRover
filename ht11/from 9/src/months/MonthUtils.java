package months;

public class MonthUtils {
       public final static Month m1 = new Month("January", 31, 21);
        public final static Month m2 = new Month("February", 29, 21);
        public final static Month m3 = new Month("March", 31, 20);
        public final static  Month m4 = new Month("April", 30, 22);
        public final static Month m5 = new Month("May", 31, 20);
        public final static Month m6 = new Month("June", 30, 20);
        public final static Month m7 = new Month("July", 31, 22);
        public final static Month m8 = new Month("August", 31, 22);
        public final static Month m9 = new Month("September", 30, 21);
        public final static  Month m10 = new Month("October", 31, 23);
        public final static Month m11 = new Month("November", 30, 20);
        public final static Month m12 = new Month("December", 31, 21);

        public final static Month [] ALL_MONTHS = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
        public final static Month [] SUMMER = {m6, m7, m8};

        public static Month [] getFirstQuarter() {
         return new Month[] {m1, m2, m3};
        }
         public static Month [] getSecondQuarter() {
         return new Month[] {m4, m5, m6};
        }
         public static Month [] getThirdQuarter() {
         return new Month[] {m7, m8, m9};
        }
        public static Month [] getFourthQuarter() {
        return new Month[] {m10, m11, m12};
        }

        public static Month [] getFirstHalfYear() {
        return new Month [] {m1, m2, m3, m4, m5, m6};
        }
        public static Month [] getSecondHalfYear() {
        return new Month [] {m7, m8, m9, m10, m11, m12};
        }
        public static Month [] getYear() {
         return ALL_MONTHS;
        }


    }
