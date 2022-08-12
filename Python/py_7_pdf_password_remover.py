# Menemukan Password yang Cocok
#   - Brute Force | Dictionary Attack
# Menulis Ulang PDF tanpa menggunakan Password
#
# PyPDF2
# pip install PyPDF2[crypto]

from PyPDF2 import PdfReader, PdfWriter, PasswordType

def Decrypt(inputfile, outputfile, passwordfile):
    reader = PdfReader(inputfile)
    writer = PdfWriter()

    pass_found = False

    if reader.is_encrypted:
        with open(passwordfile) as pf:
            for line in pf.readlines():
                password = line.strip()
                dec_result = reader.decrypt(password)

                if dec_result == PasswordType.OWNER_PASSWORD:
                    pass_found = True
                    print(f"Password Ditemukan : {password}")
                    print("Menghapus Password...")

    if pass_found:
        for page in reader.pages:
            writer.add_page(page)

        with open(outputfile, "wb") as f:
            writer.write(f)

        print("Selesai.")
    else:
        print("Password Tidak Ditemukan")

def main():
    inputfile = input("PDF File : ").strip()
    outputfile = input("Output File : ").strip()
    passwordfile = input("Password File : ").strip()

    Decrypt(inputfile, outputfile, passwordfile)

if __name__ == '__main__':
    main()
