package com.Internship.Task4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ProductFilter {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    ProductFilter.class.getResourceAsStream("products.csv"), StandardCharsets.UTF_8
                )
            );
            FileWriter fw = new FileWriter("filtered_products.csv")
        ) {
            String line;
            boolean wroteSomething = false;

            while ((line = br.readLine()) != null) {
                System.out.println("Read line: " + line);  // 👈 debug print
                String[] parts = line.split(",");
                if (parts.length < 2) continue;

                String name = parts[0].trim();
                double price = Double.parseDouble(parts[1].trim());

                if (price > 1000) {
                    fw.write(name + "," + price + "\n");
                    System.out.println("✔ Written: " + name + "," + price); // 👈 debug print
                    wroteSomething = true;
                }
            }

            if (!wroteSomething) {
                System.out.println("⚠ No products matched the condition (price > 1000).");
            }

            System.out.println("✅ Filtering complete! Check filtered_products.csv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
