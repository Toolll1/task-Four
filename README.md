## Многопоточность. Практика:
Реализовать механизм периодического асинхронного выполнения задач.
Т.е. механизм, который, не останавливая работу основной программы, раз в 10 секунд делает следующие действия:
1. пишет в консоль "Асинхронный привет!"
2. ждет (sleep) 5 секунд
3. пишет в консоль "Асинхронный пока!"
   Основная программа при этом должна каждую секунду писать в консоль "Работает основная программа".
