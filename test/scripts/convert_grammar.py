from grammar_to_regex.cfg2regex import RegexConverter

grammar = {
    "<start>" : ["<or>"],
    "<or>" : ["<and>", "<and> || <and>"],
    "<and>" : ["<equality>", "<equality> && <equality>"],
    "<equality>" : ["<comparison>", "<comparison> == <comparison>", "<comparison> != <comparison>"],
    "<comparison>" : ["<not>", "<not> < <not>", "<not> > <not>", "<not> <= <not>", "<not> >= <not>"],
    "<not>" : ["<primary>", "!<primary>"],
    "<primary>" : ["(<start>)", "<atomic>"],
    "<atomic>" : ["<identifier>", "<number>", "<string>"],
    "<identifier>" : ["<letter>", "<identifier><letter>", "<identifier><digit>"],
    "<letter>" : ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"],
    "<digit>" : ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"],
    "<number>" : ["<digit>", "<digit><number>"],
    "<string>" : ["\"<characters>\""],
    "<characters>" : ["<letter>", "<letter><characters>"]
}

converter = RegexConverter(grammar)
regex = converter.to_regex('<start>', convert_to_z3=False)

print(regex)