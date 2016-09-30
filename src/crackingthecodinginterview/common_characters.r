rm(list = ls())
final = c()
f = file("Common-characters_InputForSubmission_1.txt", open = "r")
numlines = readLines(f, n = 1)
for(line in 1:numlines){
  two = readLines(f, n = 1)
  two = unlist(strsplit(two, split = " "))
  two = sapply(two, function(x)unlist(strsplit(x, split = "")))
  for(i in 2:length(two)){
    truth = two[[1]] %in% two[[i]]
    two[[1]] = two[[1]][truth]
  }
  row = unique(two[[1]])
  str = sapply(row, function(x)return(charToRaw(x)))
  str = sort(as.numeric(str))
  str = as.raw(str)
  str = sapply(str, function(x)return(rawToChar(x)))
  str = paste(str, collapse= "")
  final = c(final, str)
}
cat(noquote(final), sep = "\n")

readLines(f, n = 1)
# sorts strings into order
str = unlist(strsplit("2Ghya6H", split = ""))


?sapply
