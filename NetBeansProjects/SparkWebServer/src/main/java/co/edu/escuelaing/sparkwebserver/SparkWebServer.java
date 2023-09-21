/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.escuelaing.sparkwebserver;

import static spark.Spark.*;

/**
 *
 * @author jeison.barreto
 */
public class SparkWebServer {

    public static void main(String... args) {
        port(getPort());

        get("/sin", (req, res) -> {
            double x = Math.sin(Double.parseDouble(req.queryParams("x")));
            return x;
        });

        get("/cos", (req, res) -> {
            double x = Math.cos(Double.parseDouble(req.queryParams("x")));
            return x;
        });

        get("/palindrome", (req, res) -> {
            String s = req.queryParams("s");
            boolean isPalindrome = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        });

        get("/magnitude", (req, res) -> {
            double x = Double.parseDouble(req.queryParams("x"));
            double y = Double.parseDouble(req.queryParams("y"));
            double result = Math.sqrt(x * x + y * y);
            return result;
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
