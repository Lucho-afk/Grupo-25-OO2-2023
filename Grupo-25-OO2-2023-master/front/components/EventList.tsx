import { useState } from "react";

export const EventList = ({ unitId }: { unitId: number }) => {
  const [events, setEvents] = useState<EventProps[]>(
    // @ts-ignore
    [...new Array(100).keys()].map((el) => ({
      id: el,
      description: `Evento #${el}`,
      createdAt: "Hoy a las 22:30",
    }))
  );

  return (
    <div className="overflow-y-auto max-h-96 ">
      <div className="flex flex-col gap-4">
        {events.map((event) => (
          <div className="bg-slate-100 p-4 rounded-md" key={event.id}>
            <p className="text-slate-950 font-medium">{event.description}</p>
            <p className="text-slate-500 text-sm">Hoy a las 22:31</p>
          </div>
        ))}
      </div>
    </div>
  );
};
