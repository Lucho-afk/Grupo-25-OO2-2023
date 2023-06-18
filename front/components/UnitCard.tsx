import { useState } from "react";
import { TrashIcon } from "./Icons";
import { Modal } from "./Modal";
import { EventList } from "./EventList";

export const UnitCard = ({
  unit: { name, id },
  handleDelete,
}: {
  unit: UnitProps;
  handleDelete: (id: number) => void;
}) => {
  const [isVisible, setIsVisible] = useState(false);

  const handleModal = () => {
    setIsVisible((prev) => !prev);
  };

  return (
    <>
      <Modal isVisible={isVisible} title={name} handleClose={handleModal}>
        <EventList unitId={id} />
      </Modal>
      <div
        className="bg-slate-100 p-4 rounded-md w-full flex justify-between cursor-pointer"
        onClick={handleModal}
      >
        <p className="text-slate-800">{name}</p>
        <button onClick={() => handleDelete(id)}>
          <TrashIcon theme="light" />
        </button>
      </div>
    </>
  );
};
