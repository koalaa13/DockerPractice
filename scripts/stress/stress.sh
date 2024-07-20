i=0
for (( ; ;))
do
  ab -n 500 -c 50 http://arch.homework/health
  for ((j=0;j<50;j++))
  do
    let i++;
    ab -n 1 -T application/json -p ./scripts/stress/post_body.txt http://arch.homework/user
    ab -n 1 http://arch.homework/user/$i
    ab -n 1 -T application/json -u ./scripts/stress/put_body.txt http://arch.homework/user/$i
    ab -n 1 http://arch.homework/user/$i
    ab -n 1 -m DELETE http://arch.homework/user/$i
    ab -n 1 http://arch.homework/user/$i
  done
  sleep 1
done
