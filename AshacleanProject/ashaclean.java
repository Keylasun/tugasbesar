package com.yourname;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CleaningServiceServlet", urlPatterns = {"/"})
public class CleaningServiceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (var out = response.getWriter()) {
            out.println("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                  <meta charset="UTF-8" />
                  <meta name="viewport" content="width=device-width, initial-scale=1" />
                  <title>Layanan Jasa Kebersihan Profesional</title>
                  <style>
                    /* CSS styles here */
                  </style>
                </head>
                <body>
                  <header>
                    <h1>Layanan Jasa Kebersihan Profesional</h1>
                  </header>
                  <main>
                    <h2>Bersih, Rapi, dan Terpercaya untuk Rumah atau Kantor Anda</h2>
                    <p>Kami menyediakan layanan kebersihan lengkap dengan tenaga profesional, peralatan modern, dan bahan ramah lingkungan untuk memastikan tempat Anda selalu bersih dan nyaman.</p>
                    <div style="text-align:center;">
                      <a href="#contact" class="btn-primary" aria-label="Hubungi kami untuk layanan">Hubungi Kami Sekarang</a>
                    </div>
                    <section class="services" aria-label="Layanan kami">
                      <div class="service">
                        <h3>Kebersihan Rumah</h3>
                        <p>Pembersihan menyeluruh ruangan, kamar mandi, dapur, dan area lainnya dengan perhatian khusus pada detail.</p>
                      </div>
                      <div class="service">
                        <h3>Kebersihan Kantor</h3>
                        <p>Layanan pembersihan yang efisien untuk ruang kerja, meja, lantai, dan area publik agar lingkungan kerja sehat.</p>
                      </div>
                      <div class="service">
                        <h3>Pembersihan Karpet & Sofa</h3>
                        <p>Pembersihan spesialis untuk menghilangkan debu, kotoran, dan noda pada karpet dan sofa Anda.</p>
                      </div>
                    </section>
                    <section id="contact" class="contact">
                      <h2>Kontak Kami</h2>
                      <p>Siap mendapatkan layanan kebersihan terbaik? Hubungi kami melalui email atau telepon.</p>
                      <p><strong>Email:</strong> <a href="mailto:info@jasakebersihan.com">info@jasakebersihan.com</a></p>
                      <p><strong>Telepon:</strong> <a href="tel:+62123456789">+62 123 456 789</a></p>
                    </section>
                  </main>
                  <footer>
                    &copy; 2024 Jasa Kebersihan Profesional. All rights reserved.
                  </footer>
                </body>
                </html>
            """);
        }
    }
}
