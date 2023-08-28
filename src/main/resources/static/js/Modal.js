const modalOpenButton = document.getElementById('modalOpenButton');
const modalCloseButton = document.getElementById('modalCloseButton');
const modal = document.getElementById('modalContainer');

const modalOpenButton1 = document.getElementById('modalOpenButton1');
const modalCloseButton1 = document.getElementById('modalCloseButton1');
const modal1 = document.getElementById('modalContainer1');

modalOpenButton.addEventListener('click', () => {
    modal.classList.remove('hidden');

});

modalCloseButton.addEventListener('click', () => {
    modal.classList.add('hidden');



});
window.addEventListener('click', (e) => {
    e.target === modal ? modal.classList.remove('show-modal') : false
})



modalOpenButton1.addEventListener('click', () => {
    modal1.classList.remove('hidden');

});

modalCloseButton1.addEventListener('click', () => {
    modal1.classList.add('hidden');



});
window.addEventListener('click', (e) => {
    e.target === modal1 ? modal1.classList.remove('show-modal') : false
})