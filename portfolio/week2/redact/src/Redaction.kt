// // COMP2850 Portfolio: Week 2
// // Function to redact sensitive information in a string
// fun redact(originalText: String, input: String, char: Char='X'): String {
//     val lengthOfString = input.length

//     val replacement = buildString {
//         for (n in 1..lengthOfString) {
//             append(char)
//         }
//     }

//     val redacted = originalText.replace(input, replacement)
//     return redacted
// }