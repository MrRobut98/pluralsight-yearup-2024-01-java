
        import java.util.Scanner;

        public class FullNameGenerator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your suffix (if any):");
                String suffix = scanner.nextLine();

                System.out.println("Enter your first name:");
                String firstName = scanner.nextLine();

                System.out.println("Enter your middle name:");
                String middleName = scanner.nextLine();

                System.out.println("Enter your last name:");
                String lastName = scanner.nextLine();

                // Build the full name
                StringBuilder fullNameBuilder = new StringBuilder();
                fullNameBuilder.append(firstName).append(" ");
                if (!middleName.isEmpty()) {
                    fullNameBuilder.append(middleName).append(" ");
                }
                fullNameBuilder.append(lastName);
                if (!suffix.isEmpty()) {
                    fullNameBuilder.append(", ").append(suffix);
                }

                String fullName = fullNameBuilder.toString();
                System.out.println("Your full name is: " + fullName);

                scanner.close();
            }
        }



