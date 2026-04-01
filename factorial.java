public class factorial {
    public static void main(String[] args) {
        // కమాండ్ లైన్ ద్వారా నంబర్ ఇచ్చారో లేదో చెక్ చేస్తుంది
        if (args.length == 0) {
            System.out.println("Please provide a number. Example: java factorial 5");
            return;
        }

        // స్ట్రింగ్ రూపంలో ఉన్న ఇన్పుట్ ని నంబర్ (Integer) లా మారుస్తుంది
        int n = Integer.parseInt(args[0]);
        long fact = 1;

        // లూప్ ఉపయోగించి ఫ్యాక్టోరియల్ లెక్కిస్తుంది
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
