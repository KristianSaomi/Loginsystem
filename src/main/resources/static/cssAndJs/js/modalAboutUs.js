const openModalButtons = document.querySelectorAll('[data-modal-target]')
const closeModalButtons = document.querySelectorAll('[data-close-button]')
const overlay = document.getElementById('overlay')
const button = document.querySelector("button");
const isActive = button.classList.contains("active");





openModalButtons.forEach(button => {
    button.addEventListener('click', () =>  {
        const modal = document.querySelector(button.dataset.modalTarget)
        openModal(modal)
        alert("open modal")
    })
})

overlay.addEventListener('click', () => {
    const modals = document.querySelectorAll('.modal.active')
    modals.forEach(modal => {
        openModal(modal)
        alert("open1 modal")
    })
})

closeModalButtons.forEach(button => {
    button.addEventListener('click', () =>  {
        const modal = button.closest('.modal')
        closeModal(modal)
        alert("Close modal")
    })
})

    function openModal(modal) {
    if (modal == null) return
        modal.classList.add('active')
        overlay.classList.add('active')
        alert("Close2 modal")
    }

function closeModal(modal) {
    if (modal == null) return
    modal.classList.remove('active')
    overlay.classList.remove('active')
    alert("Close3 modal")
}


function getPropId(inputID){
    alert(inputID);
}
