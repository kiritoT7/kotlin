fun foo(p : (String, Char) -> Boolean){}

fun main(args: Array<String>) {
    fo<caret>(1, 2
}

// ELEMENT: "foo"
// TAIL_TEXT: " { String, Char -> ... } (<root>)"
// CHAR: '\t'
