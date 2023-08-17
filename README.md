# intensives_aug2023

## Как включить asserts в IntelliJIdea

1)  Открыть Run/Debug configurations. Можно набрать в поиске Edit Configurations или через окошко вверху

<img width="136" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/99e4adc1-58d0-4346-8ff9-eb2aca306e02">

<img width="199" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/fa3a135b-723b-49df-90bf-55e049938bb2">

2) Если есть настроенная конфигурация, идем к пункту 3

Если в открывшемся окошке большое правое окно пустое, жмем +, выбираем Application

<img width="222" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/fb3ccc6c-9ea0-476d-a074-b483c70463ed">

<img width="225" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/d0ad1c82-c075-4fcc-97b0-9650f46f9cf7">

В правом окошке нужно будет заполнить Main class (обычно значение само подставляется или доступно в выпадающем списке), проверить версию языка и Working Directory

<img width="457" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/92a69c6e-ffdd-4cf4-addd-0c6e39f3db94">


3) Включаем asserts

У Build and Run ищем Modify Options, в выпадающем списке ставим галочку у Add VM Options

<img width="192" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/34fcbd5b-ea3a-46c1-ae12-747a3158014c">

<img width="269" alt="image" src="https://github.com/LanaShhh/intensives_aug2023/assets/84940283/ddb25ff8-d079-4ca8-b377-5a57c360d345">

(Обычно) справа (иногда внизу) появляется строка с надписью VM options, туда пишем *-ea* или *-enableassertions*

Внизу жмем Apply и OK

Done!

