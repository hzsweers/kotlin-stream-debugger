package misc

fun main(args: Array<String>) {
  // Breakpoint!
  sequenceOf(1, 2, 3, 4).chunked(2) { it.size }.count()
}