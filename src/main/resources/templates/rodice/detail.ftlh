[#ftl]

[@c.page title="Rodič ${rodic.celeJmeno}"]
    <h1>Rodič: <strong>${rodic.celeJmeno}</strong></h1>
    [#if rodic.email??]
    <p><i class="bi bi-at"></i><a href="mailto:${rodic.email}">${rodic.email}</a></p>
    [/#if]
    [#if rodic.telefon??]
        <p><i class="bi bi-phone"></i><a href="tel:${rodic.telefon}">${rodic.telefon}</a></p>
    [/#if]

    <h2>Děti</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Příjmení</th>
            <th scope="col">Jméno</th>
            <th scope="col">Třída</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodic.deti as student]
            <tr>
                <td>${student.prijmeni}</td>
                <td>${student.jmeno}</td>
                <td><a href="/tridy/${student.trida.id}">${student.trida.nazev}</a></td>
                <td><a href="/studenti/${student.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>

[/@c.page]