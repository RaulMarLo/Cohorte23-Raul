
    let
    
    let JanFirstDayNumber = parseInt(prompt('Introduce el dia que cayo el primero de enero, donde 0 es domingo y 6 es sabado.'))
    let yearDayNumber = parseInt(prompt('Introduce un dia de los 365 del año.'))
    let dayOfTheWeek1 = (yearDayNumber + JanFirstDayNumber)
    let dayOfTheWeek2 = (dayOfTheWeek1%7)
    
    if (dayOfTheWeek2 === 1){
        alert('El dia ' + yearDayNumber + ' del año es domingo')
    }

    else if (dayOfTheWeek2 === 2){
        alert('El dia ' + yearDayNumber + ' del año es lunes')
    }

    else if (dayOfTheWeek2 === 3){
        alert('El dia ' + yearDayNumber + ' del año es martes')
    }

    else if (dayOfTheWeek2 === 4){
        alert('El dia ' + yearDayNumber + ' del año es miercoles')
    }

    else if (dayOfTheWeek2 === 5){
        alert('El dia ' + yearDayNumber + ' del año es jueves')
    }

    else if (dayOfTheWeek2 === 6){
        alert('El dia ' + yearDayNumber + ' del año es viernes')
    }

    else if (dayOfTheWeek2 === 7){
        alert('El dia ' + yearDayNumber + ' del año es sabado')
    }

    f
