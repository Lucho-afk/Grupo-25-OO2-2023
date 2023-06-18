import { useState } from "react";
import { Modal } from "./Modal";

export const AddUnitButton = ({
  handleAddUnit,
}: {
  handleAddUnit: (name: string) => void;
}) => {
  const [unitName, setDeviceName] = useState("");
  const [isVisible, setIsVisible] = useState(false);

  const handleModal = () => {
    setIsVisible((prev) => !prev);
  };

  const wea = () => {
    handleAddUnit(unitName);
    setIsVisible((prev) => !prev);
  };

  return (
    <>
      <button
        className={`flex items-center justify-center p-2  border-2 border-slate-950 rounded-lg cursor-pointer bg-slate-950 h-fit`}
        onClick={handleModal}
      >
        Agregar unidad
      </button>
      <Modal
        title="Agregar Unidad"
        isVisible={isVisible}
        handleClose={handleModal}
      >
        <>
          <input
            type="text"
            placeholder="Nombre de la unidad"
            className="bg-slate-100 rounded-lg p-2"
            value={unitName}
            onChange={(e) => setDeviceName(e.target.value)}
          />
          <button
            type="submit"
            className="bg-slate-950 rounded-lg p-2 text-white"
            onClick={wea}
          >
            Agregar
          </button>
        </>
      </Modal>
    </>
  );
};
