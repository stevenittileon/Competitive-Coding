for i in range(int(input())):
    a, b = map(int, input().split())
    s = 0
    diff = abs(b-a)
    moves = diff//10
    remainder = diff % 10
    if remainder > 0:
        moves += 1
    print(moves)