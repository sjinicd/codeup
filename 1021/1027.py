# zfill 함수 이용하는 방법
try:
  yyyy, mm, dd = input().split('.');
  print(dd.zfill(2), mm.zfill(2), yyyy.afill(4), sep='-');
  except Exception as e:
    print(e);
    
# 일반적 방식   
    
y,m,d=input.split('.');

print('%02d' % int(d), end='-')
print('%02d' % int(m), end='-')
print('%04d' % int(y))
