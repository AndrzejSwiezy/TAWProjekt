# JavaZajecia
Projekt wykonany na zaliczenie przedmiotu Technologie i aplikacje webowe 


1. POST: localhost:8080/test/activities 

Przykład:

{
    "nazwa" : "Technologie komponentowe i sieciow",
    "punkty" : 2,
    "sala" : 208, 
    "egzamin" : "tak"
}

2. GET: localhost:8080/test/activities

HTTP CODE: 200 OK 

BODY: [
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "punkty": 2,
        "sala": 216,
        "egzamin": "tak"
    },
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "punkty": 1,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "punkty": 2,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciow",
        "punkty": 2,
        "sala": 208,
        "egzamin": "tak"
    }
]

3. GET: localhost:8080/test/activities?exam=nie

HTTP CODE: 200 OK 

BODY: [
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "punkty": 1,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "punkty": 2,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    }
]

4. GET: localhost:8080/test/activities?number=216

HTTP CODE: 200 OK 

BODY: [
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "punkty": 2,
        "sala": 216,
        "egzamin": "tak"
    },
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "punkty": 1,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "punkty": 2,
        "sala": 216,
        "egzamin": "nie"
    }
]

5. GET: localhost:8080/test/activities?exam=nie&number=208

HTTP CODE: 200 OK 

BODY: [
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    }
]

6. GET: localhost:8080/test/activities/3

HTTP CODE: 200 OK 

BODY: {
    "id": 3,
    "nazwa": "Technologie i aplikacje webowe",
    "punkty": 3,
    "sala": 208,
    "egzamin": "nie"
}

7. GET: localhost:8080/test/activities/15

HTTP CODE: 404 NOT FOUND

8. DELETE: localhost:8080/test/activities/2

HTTP CODE: 204 NO CONTENT 

9. GET: localhost:8080/test/activities

HTTP CODE: 200 OK 

BODY: [
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "punkty": 2,
        "sala": 216,
        "egzamin": "tak"
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "punkty": 2,
        "sala": 216,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "punkty": 3,
        "sala": 208,
        "egzamin": "nie"
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciow",
        "punkty": 2,
        "sala": 208,
        "egzamin": "tak"
    }
]

10. DELETE: localhost:8080/test/activities

HTTP CODE: 200 OK

11.  GET: localhost:8080/test/activities

HTTP CODE: 200 OK

BODY: []
