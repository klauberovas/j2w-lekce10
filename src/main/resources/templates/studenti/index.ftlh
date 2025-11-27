[#ftl]

[@c.page title="Seznam studentů"]
    <h1>Seznam studentů</h1>
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
        [#list studenti as student]
            <tr>
                <td>${student.prijmeni}</td>
                <td>${student.jmeno}</td>
                <td>[#if student.trida??]
                        <a href="tridy/${student.trida.id}">${student.trida.nazev}</a>[/#if]</td>
                <td><a href="studenti/${student.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]