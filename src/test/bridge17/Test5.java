package test.bridge17;

/**
 * @author times
 * @file Test5.java
 */
public class Test5 {

    public Test5() {
        int z=128;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {

                            for (int n = 0; n < 10; n++) {
                                for (int o = 0; o < 10; o++) {
                                    for (int p = 0; p < 10; p++) {
                                        for (int q = 0; q < 10; q++) {
                                            for (int r = 0; r < 10; r++) {
                                                if (i == j ||
                                                        i == k || j == k ||
                                                        i == l || j == l || k == l||
                                                        i == m|| j == m || k == m||l==m||
                                                        i == o|| j == o || k == o||l==o||m==o||
                                                        i == q|| j == q || k == q||l==q||m==q||p==q||
                                                        i == r|| j == r || k == r||l==r||m==r||p==r||q==r
                                                        ) {
                                                    continue;
                                                }
                                                int s = (i*10000+j*1000+k*100+l*10+m)/(n*10000+o*1000+p*100+q*10+r);
                                                if(s==z) {
                                                    count++;
                                                    System.out.println(i + "" + j + "" + k + "" + l+""+m+"/"+
                                                            n+""+o+""+p+""+q+""+r+" = "+z);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        System.out.println("count: " + count);
    }

}
