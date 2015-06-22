/**
 * Created by daria on 22/06/15.
 */
File file = new File("output.txt")
file.write "Hello\n"
file.append "Testing\n"
file << "More appending...\n"
File result = new File("output.txt")
println (result.text)